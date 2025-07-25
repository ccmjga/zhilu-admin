import { faker } from "@faker-js/faker";
import { http, HttpResponse } from "msw";

export default [
	http.get("/iam/permissions", () => {
		const generatePermission = () => ({
			id: faker.number.int({ min: 1, max: 20 }),
			code: `perm_${faker.lorem.words({ min: 1, max: 1 })}`,
			name: faker.lorem.words({ min: 1, max: 1 }),
			isBound: faker.datatype.boolean(),
		});

		const mockData = {
			data: faker.helpers.multiple(generatePermission, { count: 10 }),
			total: 20,
		};
		return HttpResponse.json(mockData);
	}),

	http.post("/iam/permission", async ({ request }) => {
		console.log('Captured a "POST /posts" request');
		return HttpResponse.json();
	}),

	http.delete("/iam/permission", ({ params }) => {
		console.log(`Captured a "DELETE /posts/${params.id}" request`);
		return HttpResponse.json();
	}),

	http.post("/iam/roles/:roleId/bind-permission", ({ params, request }) => {
		console.log(
			`Captured a "POST /urp/roles/${params.roleId}/bind-permission" request`,
		);
		return HttpResponse.json();
	}),

	http.post("/iam/roles/:roleId/unbind-permission", ({ params, request }) => {
		console.log(
			`Captured a "POST /urp/roles/${params.roleId}/unbind-permission" request`,
		);
		return HttpResponse.json();
	}),
];
