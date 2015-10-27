package org.swtk.commons.dict.wordnet.index.name.instance.p.a.n.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePAND {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"panda\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02512446\", \"02513086\"]}");
	add("{\"term\":\"pandanaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12174943\"]}");
	add("{\"term\":\"pandanales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12174745\"]}");
	add("{\"term\":\"pandanus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12175290\", \"12175643\"]}");
	add("{\"term\":\"pandar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10453501\"]}");
	add("{\"term\":\"pandeism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06235186\"]}");
	add("{\"term\":\"pandemic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07450313\"]}");
	add("{\"term\":\"pandemonium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13999769\"]}");
	add("{\"term\":\"pander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10453501\"]}");
	add("{\"term\":\"panderer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10415625\", \"10453501\"]}");
	add("{\"term\":\"pandiculation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00630123\"]}");
	add("{\"term\":\"pandion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01618590\"]}");
	add("{\"term\":\"pandionidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01618466\"]}");
	add("{\"term\":\"pandora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09601426\"]}");
	add("{\"term\":\"pandowdy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07638972\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }