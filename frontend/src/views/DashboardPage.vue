<template>
  <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-5 gap-2 sm:gap-4 p-2 sm:p-4">
    <div class="lg:col-span-3 md:col-span-2 col-span-1 bg-white rounded-lg shadow-sm p-3 sm:p-4 md:p-6">
      <div class="flex flex-col sm:flex-row sm:justify-between pb-4 mb-4 border-b border-gray-200 gap-y-3 sm:gap-y-0">
        <div class="flex items-center">
          <div class="w-10 h-10 sm:w-12 sm:h-12 rounded-lg bg-gray-100 flex items-center justify-center me-3">
            <svg class="w-5 h-5 sm:w-6 sm:h-6 text-gray-500" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
              fill="currentColor" viewBox="0 0 20 19">
              <path
                d="M14.5 0A3.987 3.987 0 0 0 11 2.1a4.977 4.977 0 0 1 3.9 5.858A3.989 3.989 0 0 0 14.5 0ZM9 13h2a4 4 0 0 1 4 4v2H5v-2a4 4 0 0 1 4-4Z" />
              <path
                d="M5 19h10v-2a4 4 0 0 0-4-4H9a4 4 0 0 0-4 4v2ZM5 7a5.008 5.008 0 0 1 4-4.9 3.988 3.988 0 1 0-3.9 5.859A4.974 4.974 0 0 1 5 7Zm5 3a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm5-1h-.424a5.016 5.016 0 0 1-1.942 2.232A6.007 6.007 0 0 1 17 17h2a1 1 0 0 0 1-1v-2a5.006 5.006 0 0 0-5-5ZM5.424 9H5a5.006 5.006 0 0 0-5 5v2a1 1 0 0 0 1 1h2a6.007 6.007 0 0 1 4.366-5.768A5.016 5.016 0 0 1 5.424 9Z" />
            </svg>
          </div>
          <div>
            <h5 class="leading-none text-xl sm:text-2xl font-bold text-gray-900 pb-1">3.4k</h5>
            <p class="text-xs sm:text-sm font-normal text-gray-500">Leads generated per week</p>
          </div>
        </div>
        <div>
          <span
            class="bg-green-100 text-green-800 text-xs font-medium inline-flex items-center px-2 py-0.5 sm:px-2.5 sm:py-1 rounded-md">
            <svg class="w-2 h-2 sm:w-2.5 sm:h-2.5 me-1.5" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
              fill="none" viewBox="0 0 10 14">
              <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                d="M5 13V1m0 0L1 5m4-4 4 4" />
            </svg>
            42.5%
          </span>
        </div>
      </div>

      <div class="grid grid-cols-1 sm:grid-cols-2 gap-2 sm:gap-0">
        <dl class="flex items-center">
          <dt class="text-gray-500 text-xs sm:text-sm font-normal me-1">Money spent:</dt>
          <dd class="text-gray-900 text-xs sm:text-sm font-semibold">$3,232</dd>
        </dl>
        <dl class="flex items-center sm:justify-end">
          <dt class="text-gray-500 text-xs sm:text-sm font-normal me-1">Conversion rate:</dt>
          <dd class="text-gray-900 text-xs sm:text-sm font-semibold">1.2%</dd>
        </dl>
      </div>

      <div id="column-chart" class="my-3 sm:my-4"></div>
      <div class="grid grid-cols-1 items-center border-gray-200 border-t justify-between">
        <div class="flex flex-col sm:flex-row justify-between items-center pt-3 sm:pt-5 gap-y-2 sm:gap-y-0">
          <!-- Button -->
          <button id="dropdownDefaultButton" data-dropdown-toggle="lastDaysdropdown" data-dropdown-placement="bottom"
            class="text-xs sm:text-sm font-medium text-gray-500 hover:text-gray-900 text-center inline-flex items-center"
            type="button">
            Last 7 days
            <svg class="w-2 h-2 sm:w-2.5 m-2.5 ms-1.5" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none"
              viewBox="0 0 10 6">
              <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                d="m1 1 4 4 4-4" />
            </svg>
          </button>
          <!-- Dropdown menu -->
          <div id="lastDaysdropdown"
            class="z-10 hidden bg-white divide-y divide-gray-100 rounded-lg shadow-sm w-36 sm:w-44">
            <ul class="py-2 text-xs sm:text-sm text-gray-700" aria-labelledby="dropdownDefaultButton">
              <li>
                <a href="#" class="block px-4 py-2 hover:bg-gray-100  ">Yesterday</a>
              </li>
              <li>
                <a href="#" class="block px-4 py-2 hover:bg-gray-100  ">Today</a>
              </li>
              <li>
                <a href="#" class="block px-4 py-2 hover:bg-gray-100  ">Last
                  7 days</a>
              </li>
              <li>
                <a href="#" class="block px-4 py-2 hover:bg-gray-100  ">Last
                  30 days</a>
              </li>
              <li>
                <a href="#" class="block px-4 py-2 hover:bg-gray-100  ">Last
                  90 days</a>
              </li>
            </ul>
          </div>
          <a href="#"
            class="uppercase text-sm font-semibold inline-flex items-center rounded-lg text-blue-600 hover:text-blue-700   hover:bg-gray-100    px-3 py-2">
            Leads Report
            <svg class="w-2.5 h-2.5 ms-1.5 rtl:rotate-180" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
              fill="none" viewBox="0 0 6 10">
              <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                d="m1 9 4-4-4-4" />
            </svg>
          </a>
        </div>
      </div>
    </div>
    <div
      class="lg:col-span-2 md:col-span-1 col-span-1 bg-white border border-gray-200 rounded-lg shadow-sm p-3 sm:p-4 md:p-6">
      <div class="flex items-center justify-between mb-4">
        <h5 class="text-lg sm:text-xl font-bold leading-none text-gray-900">Latest Customers</h5>
        <a href="#" class="text-xs sm:text-sm font-medium text-blue-600 hover:underline">
          View all
        </a>
      </div>
      <div class="flow-root">
        <ul role="list" class="divide-y divide-gray-200">
          <li class="py-2 sm:py-3 md:py-4">
            <div class="flex items-center">
              <div class="shrink-0">
                <img src="/trump.jpg" class="w-6 h-6 sm:w-8 sm:h-8 rounded-full" alt="Neil image" />
              </div>
              <div class="flex-1 min-w-0 ms-3 sm:ms-4">
                <p class="text-xs sm:text-sm font-medium text-gray-900 truncate">
                  Neil Sims
                </p>
                <p class="text-xs hidden xs:block sm:text-sm text-gray-500 truncate">
                  email@windster.com
                </p>
              </div>
              <div class="inline-flex items-center text-sm sm:text-base font-semibold text-gray-900">
                $320
              </div>
            </div>
          </li>
          <li class="py-2 sm:py-3 md:py-4">
            <div class="flex items-center">
              <div class="shrink-0">
                <img src="/trump.jpg" class="w-6 h-6 sm:w-8 sm:h-8 rounded-full" alt="Bonnie image" />
              </div>
              <div class="flex-1 min-w-0 ms-3 sm:ms-4">
                <p class="text-xs sm:text-sm font-medium text-gray-900 truncate">
                  Bonnie Green
                </p>
                <p class="text-xs hidden xs:block sm:text-sm text-gray-500 truncate">
                  email@windster.com
                </p>
              </div>
              <div class="inline-flex items-center text-sm sm:text-base font-semibold text-gray-900">
                $3467
              </div>
            </div>
          </li>
          <li class="py-2 sm:py-3 md:py-4">
            <div class="flex items-center">
              <div class="shrink-0">
                <img src="/trump.jpg" class="w-6 h-6 sm:w-8 sm:h-8 rounded-full" alt="Michael image" />
              </div>
              <div class="flex-1 min-w-0 ms-3 sm:ms-4">
                <p class="text-xs sm:text-sm font-medium text-gray-900 truncate">
                  Michael Gough
                </p>
                <p class="text-xs hidden xs:block sm:text-sm text-gray-500 truncate">
                  email@windster.com
                </p>
              </div>
              <div class="inline-flex items-center text-sm sm:text-base font-semibold text-gray-900">
                $67
              </div>
            </div>
          </li>
          <li class="py-2 sm:py-3 md:py-4">
            <div class="flex items-center">
              <div class="shrink-0">
                <img src="/trump.jpg" class="w-6 h-6 sm:w-8 sm:h-8 rounded-full" alt="Lana image" />
              </div>
              <div class="flex-1 min-w-0 ms-3 sm:ms-4">
                <p class="text-xs sm:text-sm font-medium text-gray-900 truncate">
                  Lana Byrd
                </p>
                <p class="text-xs hidden xs:block sm:text-sm text-gray-500 truncate">
                  email@windster.com
                </p>
              </div>
              <div class="inline-flex items-center text-sm sm:text-base font-semibold text-gray-900">
                $367
              </div>
            </div>
          </li>
          <li class="pt-2 sm:pt-3 md:pt-4 pb-0">
            <div class="flex items-center">
              <div class="shrink-0">
                <img src="/trump.jpg" class="w-6 h-6 sm:w-8 sm:h-8 rounded-full" alt="Thomas image" />
              </div>
              <div class="flex-1 min-w-0 ms-3 sm:ms-4">
                <p class="text-xs sm:text-sm font-medium text-gray-900 truncate">
                  Thomes Lean
                </p>
                <p class="text-xs hidden xs:block sm:text-sm text-gray-500 truncate">
                  email@windster.com
                </p>
              </div>
              <div class="inline-flex items-center text-sm sm:text-base font-semibold text-gray-900">
                $2367
              </div>
            </div>
          </li>
        </ul>
      </div>
    </div>
    <div class="lg:col-span-2 md:col-span-2 col-span-1 bg-white rounded-lg shadow-sm p-3 sm:p-4 md:p-6">

      <div class="flex flex-col sm:flex-row justify-between items-start w-full gap-y-3 sm:gap-y-0">
        <div class="flex-col items-center">
          <div class="flex items-center mb-1">
            <h5 class="text-lg sm:text-xl font-bold leading-none text-gray-900 me-1">Website traffic</h5>
            <svg data-popover-target="chart-info" data-popover-placement="bottom"
              class="w-3 h-3 sm:w-3.5 sm:h-3.5 text-gray-500 hover:text-gray-900 cursor-pointer ms-1" aria-hidden="true"
              xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
              <path
                d="M10 .5a9.5 9.5 0 1 0 9.5 9.5A9.51 9.51 0 0 0 10 .5Zm0 16a1.5 1.5 0 1 1 0-3 1.5 1.5 0 0 1 0 3Zm1-5.034V12a1 1 0 0 1-2 0v-1.418a1 1 0 0 1 1.038-.999 1.436 1.436 0 0 0 1.488-1.441 1.501 1.501 0 1 0-3-.116.986.986 0 0 1-1.037.961 1 1 0 0 1-.96-1.037A3.5 3.5 0 1 1 11 11.466Z" />
            </svg>
            <div data-popover id="chart-info" role="tooltip"
              class="absolute z-10 invisible inline-block text-sm text-gray-500 transition-opacity duration-300 bg-white border border-gray-200 rounded-lg shadow-xs opacity-0 w-72 ">
              <div class="p-3 space-y-2">
                <h3 class="font-semibold text-gray-900 ">Activity growth - Incremental</h3>
                <p>Report helps navigate cumulative growth of community activities. Ideally, the chart should have a
                  growing trend, as stagnating chart signifies a significant decrease of community activity.</p>
                <h3 class="font-semibold text-gray-900 ">Calculation</h3>
                <p>For each date bucket, the all-time volume of activities is calculated. This means that activities in
                  period n contain all activities up to period n, plus the activities generated by your community in
                  period.</p>
                <a href="#"
                  class="flex items-center font-medium text-blue-600   hover:text-blue-700 hover:underline">Read
                  more <svg class="w-2 h-2 ms-1.5 rtl:rotate-180" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
                    fill="none" viewBox="0 0 6 10">
                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                      d="m1 9 4-4-4-4" />
                  </svg></a>
              </div>
              <div data-popper-arrow></div>
            </div>
          </div>
          <button id="dateRangeButton" data-dropdown-toggle="dateRangeDropdown"
            data-dropdown-ignore-click-outside-class="datepicker" type="button"
            class="inline-flex items-center text-blue-700 font-medium hover:underline text-xs sm:text-sm">31 Nov - 31
            Dev <svg class="w-2.5 h-2.5 sm:w-3 sm:h-3 ms-2" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
              fill="none" viewBox="0 0 10 6">
              <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                d="m1 1 4 4 4-4" />
            </svg>
          </button>
          <div id="dateRangeDropdown"
            class="z-10 hidden bg-white divide-y divide-gray-100 rounded-lg shadow-sm w-80 lg:w-96">
            <div class="p-3" aria-labelledby="dateRangeButton">
              <div date-rangepicker datepicker-autohide class="flex items-center">
                <div class="relative">
                  <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                    <svg class="w-4 h-4 text-gray-500 " aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
                      fill="currentColor" viewBox="0 0 20 20">
                      <path
                        d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                    </svg>
                  </div>
                  <input name="start" type="text"
                    class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5       "
                    placeholder="Start date">
                </div>
                <span class="mx-2 text-gray-500 ">to</span>
                <div class="relative">
                  <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                    <svg class="w-4 h-4 text-gray-500 " aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
                      fill="currentColor" viewBox="0 0 20 20">
                      <path
                        d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                    </svg>
                  </div>
                  <input name="end" type="text"
                    class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5       "
                    placeholder="End date">
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="flex justify-end items-center">
          <button id="widgetDropdownButton" data-dropdown-toggle="widgetDropdown" data-dropdown-placement="bottom"
            type="button"
            class="inline-flex items-center justify-center text-gray-500 w-7 h-7 sm:w-8 sm:h-8 hover:bg-gray-100 focus:outline-none focus:ring-4 focus:ring-gray-200 rounded-lg text-sm">
            <svg class="w-3 h-3 sm:w-3.5 sm:h-3.5 text-gray-800" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
              fill="currentColor" viewBox="0 0 16 3">
              <path
                d="M2 0a1.5 1.5 0 1 1 0 3 1.5 1.5 0 0 1 0-3Zm6.041 0a1.5 1.5 0 1 1 0 3 1.5 1.5 0 0 1 0-3ZM14 0a1.5 1.5 0 1 1 0 3 1.5 1.5 0 0 1 0-3Z" />
            </svg><span class="sr-only">Open dropdown</span>
          </button>
          <div id="widgetDropdown" class="z-10 hidden bg-white divide-y divide-gray-100 rounded-lg shadow-sm w-44">
            <ul class="py-2 text-sm text-gray-700" aria-labelledby="widgetDropdownButton">
              <li>
                <a href="#" class="flex items-center px-4 py-2 hover:bg-gray-100  "><svg class="w-3 h-3 me-2"
                    aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 21 21">
                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                      d="M7.418 17.861 1 20l2.139-6.418m4.279 4.279 10.7-10.7a3.027 3.027 0 0 0-2.14-5.165c-.802 0-1.571.319-2.139.886l-10.7 10.7m4.279 4.279-4.279-4.279m2.139 2.14 7.844-7.844m-1.426-2.853 4.279 4.279" />
                  </svg>Edit widget
                </a>
              </li>
              <li>
                <a href="#" class="flex items-center px-4 py-2 hover:bg-gray-100  "><svg class="w-3 h-3 me-2"
                    aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                    <path
                      d="M14.707 7.793a1 1 0 0 0-1.414 0L11 10.086V1.5a1 1 0 0 0-2 0v8.586L6.707 7.793a1 1 0 1 0-1.414 1.414l4 4a1 1 0 0 0 1.416 0l4-4a1 1 0 0 0-.002-1.414Z" />
                    <path
                      d="M18 12h-2.55l-2.975 2.975a3.5 3.5 0 0 1-4.95 0L4.55 12H2a2 2 0 0 0-2 2v4a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2v-4a2 2 0 0 0-2-2Zm-3 5a1 1 0 1 1 0-2 1 1 0 0 1 0 2Z" />
                  </svg>Download data
                </a>
              </li>
              <li>
                <a href="#" class="flex items-center px-4 py-2 hover:bg-gray-100  "><svg class="w-3 h-3 me-2"
                    aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 18 18">
                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                      d="m5.953 7.467 6.094-2.612m.096 8.114L5.857 9.676m.305-1.192a2.581 2.581 0 1 1-5.162 0 2.581 2.581 0 0 1 5.162 0ZM17 3.84a2.581 2.581 0 1 1-5.162 0 2.581 2.581 0 0 1 5.162 0Zm0 10.322a2.581 2.581 0 1 1-5.162 0 2.581 2.581 0 0 1 5.162 0Z" />
                  </svg>Add to repository
                </a>
              </li>
              <li>
                <a href="#" class="flex items-center px-4 py-2 hover:bg-gray-100  "><svg class="w-3 h-3 me-2"
                    aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 18 20">
                    <path
                      d="M17 4h-4V2a2 2 0 0 0-2-2H7a2 2 0 0 0-2 2v2H1a1 1 0 0 0 0 2h1v12a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V6h1a1 1 0 1 0 0-2ZM7 2h4v2H7V2Zm1 14a1 1 0 1 1-2 0V8a1 1 0 0 1 2 0v8Zm4 0a1 1 0 0 1-2 0V8a1 1 0 0 1 2 0v8Z" />
                  </svg>Delete widget
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>

      <!-- Line Chart -->
      <div class="py-4 sm:py-6" id="pie-chart"></div>

      <div class="grid grid-cols-1 items-center border-gray-200 border-t justify-between">
        <div class="flex flex-col sm:flex-row justify-between items-center pt-3 sm:pt-5 gap-y-2 sm:gap-y-0">
          <!-- Button -->
          <button id="dropdownDefaultButton" data-dropdown-toggle="lastDaysdropdown" data-dropdown-placement="bottom"
            class="text-xs sm:text-sm font-medium text-gray-500 hover:text-gray-900 text-center inline-flex items-center"
            type="button">
            Last 7 days
            <svg class="w-2 h-2 sm:w-2.5 sm:h-2.5 m-2.5 ms-1.5" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
              fill="none" viewBox="0 0 10 6">
              <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                d="m1 1 4 4 4-4" />
            </svg>
          </button>
          <div id="lastDaysdropdown" class="z-10 hidden bg-white divide-y divide-gray-100 rounded-lg shadow-sm w-44">
            <ul class="py-2 text-xs sm:text-sm text-gray-700" aria-labelledby="dropdownDefaultButton">
              <li>
                <a href="#" class="block px-4 py-2 hover:bg-gray-100">Yesterday</a>
              </li>
              <li>
                <a href="#" class="block px-4 py-2 hover:bg-gray-100">Today</a>
              </li>
              <li>
                <a href="#" class="block px-4 py-2 hover:bg-gray-100">Last
                  7 days</a>
              </li>
              <li>
                <a href="#" class="block px-4 py-2 hover:bg-gray-100">Last
                  30 days</a>
              </li>
              <li>
                <a href="#" class="block px-4 py-2 hover:bg-gray-100">Last
                  90 days</a>
              </li>
            </ul>
          </div>
          <a href="#"
            class="uppercase text-xs sm:text-sm font-semibold inline-flex items-center rounded-lg text-blue-600 hover:text-blue-700 hover:bg-gray-100 px-3 py-2">
            Traffic analysis
            <svg class="w-2 h-2 sm:w-2.5 sm:h-2.5 ms-1.5 rtl:rotate-180" aria-hidden="true"
              xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 6 10">
              <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                d="m1 9 4-4-4-4" />
            </svg>
          </a>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
import ApexCharts from "apexcharts";
import { onMounted, ref } from "vue";

onMounted(() => {
	const options = {
		colors: ["#1A56DB", "#FDBA8C"],
		series: [
			{
				name: "Organic",
				color: "#1A56DB",
				data: [
					{ x: "Mon", y: 231 },
					{ x: "Tue", y: 122 },
					{ x: "Wed", y: 63 },
					{ x: "Thu", y: 421 },
					{ x: "Fri", y: 122 },
					{ x: "Sat", y: 323 },
					{ x: "Sun", y: 111 },
				],
			},
			{
				name: "Social media",
				color: "#FDBA8C",
				data: [
					{ x: "Mon", y: 232 },
					{ x: "Tue", y: 113 },
					{ x: "Wed", y: 341 },
					{ x: "Thu", y: 224 },
					{ x: "Fri", y: 522 },
					{ x: "Sat", y: 411 },
					{ x: "Sun", y: 243 },
				],
			},
		],
		chart: {
			type: "bar",
			height: "320px",
			fontFamily: "Inter, sans-serif",
			toolbar: {
				show: false,
			},
		},
		plotOptions: {
			bar: {
				horizontal: false,
				columnWidth: "70%",
				borderRadiusApplication: "end",
				borderRadius: 8,
			},
		},
		tooltip: {
			shared: true,
			intersect: false,
			style: {
				fontFamily: "Inter, sans-serif",
			},
		},
		states: {
			hover: {
				filter: {
					type: "darken",
					value: 1,
				},
			},
		},
		stroke: {
			show: true,
			width: 0,
			colors: ["transparent"],
		},
		grid: {
			show: false,
			strokeDashArray: 4,
			padding: {
				left: 2,
				right: 2,
				top: -14,
			},
		},
		dataLabels: {
			enabled: false,
		},
		legend: {
			show: false,
		},
		xaxis: {
			floating: false,
			labels: {
				show: true,
				style: {
					fontFamily: "Inter, sans-serif",
					cssClass: "text-xs font-normal fill-gray-500 ",
				},
			},
			axisBorder: {
				show: false,
			},
			axisTicks: {
				show: false,
			},
		},
		yaxis: {
			show: false,
		},
		fill: {
			opacity: 1,
		},
	};

	const getChartOptions = () => {
		return {
			series: [52.8, 26.8, 20.4],
			colors: ["#1C64F2", "#16BDCA", "#9061F9"],
			chart: {
				height: 420,
				width: "100%",
				type: "pie",
			},
			stroke: {
				colors: ["white"],
				lineCap: "",
			},
			plotOptions: {
				pie: {
					labels: {
						show: true,
					},
					size: "100%",
					dataLabels: {
						offset: -25,
					},
				},
			},
			labels: ["Direct", "Organic search", "Referrals"],
			dataLabels: {
				enabled: true,
				style: {
					fontFamily: "Inter, sans-serif",
				},
			},
			legend: {
				position: "bottom",
				fontFamily: "Inter, sans-serif",
			},
			yaxis: {
				labels: {
					formatter: (value: string) => `${value}%`,
				},
			},
			xaxis: {
				labels: {
					formatter: (value: string) => `${value}%`,
				},
				axisTicks: {
					show: false,
				},
				axisBorder: {
					show: false,
				},
			},
		};
	};

	if (
		document.getElementById("pie-chart") &&
		typeof ApexCharts !== "undefined"
	) {
		const chart = new ApexCharts(
			document.getElementById("pie-chart"),
			getChartOptions(),
		);
		chart.render();
	}

	if (
		document.getElementById("column-chart") &&
		typeof ApexCharts !== "undefined"
	) {
		const chart = new ApexCharts(
			document.getElementById("column-chart"),
			options,
		);
		chart.render();
	}

	if (
		document.getElementById("data-series-chart") &&
		typeof ApexCharts !== "undefined"
	) {
		const chart = new ApexCharts(
			document.getElementById("data-series-chart"),
			options,
		);
		chart.render();
	}
});
</script>

<style scoped></style>
