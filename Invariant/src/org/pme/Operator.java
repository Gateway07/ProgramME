package org.pme;

/*
- Aliasing
- Joining (Union/Intersect/Except)
- Grouping and Folding
- Limiting and Ordering
- Unfolding

statement ::= select
    select ::= SELECT [DISTINCT] param AS alias [, param AS alias]* FROM predicate [AS alias]
        [[INNER] | (LEFT | RIGHT | FULL) [OUTER] JOIN predicate ON condition | TRUE]*
        [WHERE condition]
        [GROUP BY param* HAVING folding_condition*]
        [ORDER BY param*]
        [UNION | INTERSECT | EXCEPT select]
        [LIMIT numeric]
    condition ::= [alias.]param = ([alias.]param | const) [AND [alias.]param = [param | const]]*
    const ::= NULL | (numeric | string) | ? | [const [, const]*] | {param: const [, param: const]*}
    folding ::= MIN | MAX | SUM | COUNT
    unfolding ::= HEAD(list/map) | TAIL(list/map) | TABLE(list/map)
 */
public @interface Operator {
    String value();
}
