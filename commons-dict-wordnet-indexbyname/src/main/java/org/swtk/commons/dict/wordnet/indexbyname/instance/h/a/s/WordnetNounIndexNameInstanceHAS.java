package org.swtk.commons.dict.wordnet.indexbyname.instance.h.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"haschisch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03502307\"]}");
	add("{\"term\":\"hasdrubal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11053627\"]}");
	add("{\"term\":\"hasek\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11053866\"]}");
	add("{\"term\":\"hash\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03502307\", \"07885367\"]}");
	add("{\"term\":\"hash head\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10181215\"]}");
	add("{\"term\":\"hash house\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03502225\"]}");
	add("{\"term\":\"hash mark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06898004\"]}");
	add("{\"term\":\"hasheesh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03502307\"]}");
	add("{\"term\":\"hashemite kingdom of jordan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08946959\"]}");
	add("{\"term\":\"hashish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03502307\"]}");
	add("{\"term\":\"hashmark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06898004\"]}");
	add("{\"term\":\"hasid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10181288\"]}");
	add("{\"term\":\"hasidim\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08111832\"]}");
	add("{\"term\":\"hasidism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06244411\", \"08111832\"]}");
	add("{\"term\":\"haslet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07687698\"]}");
	add("{\"term\":\"hasp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03502477\"]}");
	add("{\"term\":\"hassam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11053988\"]}");
	add("{\"term\":\"hassel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11054163\"]}");
	add("{\"term\":\"hassid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10181288\"]}");
	add("{\"term\":\"hassidim\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08111832\"]}");
	add("{\"term\":\"hassidism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06244411\"]}");
	add("{\"term\":\"hassium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14663973\"]}");
	add("{\"term\":\"hassle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01174931\", \"07387165\"]}");
	add("{\"term\":\"hassock\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03502656\", \"03863938\"]}");
	add("{\"term\":\"hastate leaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13179156\"]}");
	add("{\"term\":\"haste\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14474655\", \"00556685\", \"05067358\"]}");
	add("{\"term\":\"hastinapura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06475229\"]}");
	add("{\"term\":\"hastiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04670215\", \"05067358\"]}");
	add("{\"term\":\"hastings\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01283007\", \"08903703\", \"11054303\"]}");
	add("{\"term\":\"hasty defence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00963288\"]}");
	add("{\"term\":\"hasty defense\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00963288\"]}");
	add("{\"term\":\"hasty pudding\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07719344\", \"07719634\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }