<template>
  <svg :class="{
    'inline': true,
    [textColor]: true,
    [size]: true,
  }" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 24 24">
    <path d="M7 5a2 2 0 0 0-2 2v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V7a2 2 0 0 0-2-2H7Z" />
  </svg>
</template>

<script setup lang="ts">
const { size = "w-5 h-5", textColor = "text-white" } = defineProps<{
	size?: string;
	textColor?: string;
}>();
</script>
