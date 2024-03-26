
use scratch; 

drop table if exists booltest; 
create table booltest (a integer, b integer); 
insert into booltest values (1, 0); 
select * from booltest; 



select 
	case when a < 5 then 'true' else 'false' end as boolA, 
    case when b > 0 then 'true' else 'false' end as boolB
    from booltest
    ; 
    
select if(a < 5, 'true', 'false') from booltest;
select if (b > 0, 'true', 'false') from booltest;