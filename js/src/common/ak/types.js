//@flow

export type OldSelectValue = string | number;

export type OldSelectItem<T: OldSelectValue> = {
    +value: T,
    +label: string
};

export type SingleValueType = {
    +value: any,
    +label: string,
    +imgSrc?: string
};
