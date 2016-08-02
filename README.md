# Consistent-Subgraphs

Consider	a	directed	acyclic	graph	(DAG),	where		is	a	set	of	vertices	and		is	a	set	of	directed	edges.A	sub‐DAG	, of	is	called	consistent	if	it	has	the	following	property:	⊆ 	and	for	any		∈		all	of	the	parents	of		must	also	be	in	.	Develop	and	implement	an	algorithm	that	enumerates	all	consistent	sub‐DAGs	for	a	given	DAG	.	You	can	assume	the	DAG	has	a	single	root	node	(node	without	any	parents).	Your	algorithm	must	be	sub‐exponential	in	the	number	of	nodes	;	that	is,	it	is	not	allowed	to	generate	all	subsets	of	the	set	of	nodes		and	then	check	if	each	such	subset	is	consistent.	However,	you	can	use	this	brute‐force	algorithm	to	test	your	new	algorithm	on	various	small	problems.

a)	(30	points)	Special	case:	The	DAG		is	a	tree.	That	is,	each	node	can	have	at	most	one	parent,	but	it	can	have	any	number	of	children.

b)	(70	points)	General	case:	The	DAG		is	not	a	tree.	That	is,	each	node	can	have	any	number	of	parents
