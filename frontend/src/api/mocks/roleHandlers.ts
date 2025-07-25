import { faker } from "@faker-js/faker";
import { http, HttpResponse } from "msw";

export default [
	http.get("/iam/roles", () => {
		const generatePermission = () => ({
			id: faker.number.int({ min: 1, max: 100 }),
			code: `perm_${faker.lorem.word()}`,
			name: faker.lorem.words({ min: 1, max: 3 }),
		});

		const generateRole = () => ({
			id: faker.number.int({ min: 1, max: 100 }),
			code: faker.helpers.arrayElement([
				"admin",
				"editor",
				"viewer",
				"manager",
			]),
			name: faker.person.jobTitle(),
			isBound: faker.datatype.boolean(),
			permissions: faker.helpers.multiple(generatePermission, {
				count: { min: 1, max: 5 },
			}),
		});

		const mockData = {
			data: faker.helpers.multiple(generateRole, { count: 10 }),
			total: 20,
		};

		return HttpResponse.json(mockData);
	}),
	http.get("/iam/role", ({ params }) => {
		const generatePermission = () => ({
			id: faker.number.int({ min: 1, max: 10 }),
			code: `perm_${faker.lorem.word()}`,
			name: faker.lorem.words({ min: 1, max: 3 }),
		});

		const generateRole = () => ({
			id: faker.number.int({ min: 1, max: 100 }),
			code: faker.helpers.arrayElement([
				"admin",
				"editor",
				"viewer",
				"manager",
			]),
			name: faker.person.jobTitle(),
			permissions: faker.helpers.multiple(generatePermission, {
				count: { min: 1, max: 5 },
			}),
		});

		return HttpResponse.json(generateRole());
	}),

	http.post("/iam/role", async ({ request }) => {
		console.log('Captured a "POST /urp/role" request');
		return HttpResponse.json();
	}),

	http.post("/iam/permission/bind", async ({ request }) => {
		console.log('Captured a "POST /iam/permission/bind" request');
		return HttpResponse.json();
	}),

	http.post("/iam/permission/unbind", async ({ request }) => {
		console.log('Captured a "POST /iam/permission/unbind" request');
		return HttpResponse.json();
	}),

	http.delete("/iam/role", ({ params }) => {
		console.log(`Captured a "DELETE /urp/role ${params.id}" request`);
		return HttpResponse.json();
	}),
];
