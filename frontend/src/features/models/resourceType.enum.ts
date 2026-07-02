

export const Type = {
    ARTICLE: "ARTICLE",
    VIDEO: "VIDEO",
    DOCUMENTATION: "DOCUMENTATION",
    COURSE: "COURSE",
    OTHER: "OTHER",
} as const

export type ResourceType = typeof Type[keyof typeof Type]