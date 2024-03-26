
use land;


select * 
from continent;


select continent_id, 
	continent_name, 
	population
from continent
order by continent_name;

select continent_id, 
	continent_name, 
	population 
from continent
order by population desc; 