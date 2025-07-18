import client from "@/api/client";
import { ref } from "vue";
import type { components } from "../../api/types/schema";

export const useUserQuery = () => {
	const total = ref<number>(0);
	const users = ref<components["schemas"]["UserRolePermissionDto"][]>([]);
	const user = ref<components["schemas"]["UserRolePermissionDto"]>();

	const getUserWithDetail = async (userId: number) => {
		const { data } = await client.GET("/iam/user", {
			params: {
				query: {
					userId: userId,
				},
			},
		});
		user.value = data;
	};

	const fetchUsersWith = async (
		param: {
			username?: string;
			startDate?: string;
			endDate?: string;
		},
		page = 1,
		size = 10,
		sortBy = "id:desc",
	) => {
		const { data } = await client.GET("/iam/users", {
			params: {
				query: {
					pageRequestDto: {
						page,
						size,
						sortBy,
					},
					userQueryDto: param,
				},
			},
		});
		total.value = !data || !data.total ? 0 : data.total;
		users.value = data?.data ?? [];
	};

	return {
		total,
		users,
		user,
		fetchUsersWith,
		getUserWithDetail,
	};
};
