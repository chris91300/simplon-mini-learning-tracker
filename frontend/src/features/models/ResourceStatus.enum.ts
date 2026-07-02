

export const Status = {
    TODO: "TODO",
    IN_PROGRESS: "IN_PROGRESS",
    DONE: "DONE"
} as const

export type ResourceStatus = typeof Status[keyof typeof Status]