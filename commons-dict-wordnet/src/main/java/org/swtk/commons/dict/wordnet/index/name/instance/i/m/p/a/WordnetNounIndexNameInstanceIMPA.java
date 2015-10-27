package org.swtk.commons.dict.wordnet.index.name.instance.i.m.p.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIMPA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"impact\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01174742\", \"00158777\", \"11434525\", \"07353152\"]}");
	add("{\"term\":\"impaction\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00127267\", \"14083899\", \"14084057\", \"14600876\"]}");
	add("{\"term\":\"impairer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09333366\"]}");
	add("{\"term\":\"impairment\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00273722\", \"00404142\", \"14571935\", \"14585210\", \"07435370\"]}");
	add("{\"term\":\"impala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02425345\"]}");
	add("{\"term\":\"impalement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00421872\"]}");
	add("{\"term\":\"impalpability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04767551\"]}");
	add("{\"term\":\"impartation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06263084\"]}");
	add("{\"term\":\"impartiality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06212421\"]}");
	add("{\"term\":\"imparting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06263084\"]}");
	add("{\"term\":\"impasse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02854799\", \"14038832\"]}");
	add("{\"term\":\"impassiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07498922\"]}");
	add("{\"term\":\"impassivity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07498922\"]}");
	add("{\"term\":\"impasto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00939066\"]}");
	add("{\"term\":\"impatience\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04649953\", \"07529310\", \"14430687\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }