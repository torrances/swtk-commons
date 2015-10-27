package org.swtk.commons.dict.wordnet.index.name.instance.c.o.r.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCORP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"corp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08076248\"]}");
	add("{\"term\":\"corporal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09985669\"]}");
	add("{\"term\":\"corporality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04768026\"]}");
	add("{\"term\":\"corporation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05563704\", \"08076248\"]}");
	add("{\"term\":\"corporatism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05204311\"]}");
	add("{\"term\":\"corporatist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09986000\"]}");
	add("{\"term\":\"corporeality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04768026\"]}");
	add("{\"term\":\"corposant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11460898\"]}");
	add("{\"term\":\"corps\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08230000\", \"08229448\"]}");
	add("{\"term\":\"corpse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05225393\"]}");
	add("{\"term\":\"corpulence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05007702\"]}");
	add("{\"term\":\"corpulency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05007507\"]}");
	add("{\"term\":\"corpus\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05228819\", \"07972069\", \"13376883\"]}");
	add("{\"term\":\"corpuscle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05456844\", \"14609699\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }