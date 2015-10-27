package org.swtk.commons.dict.wordnet.index.name.instance.r.i.c.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRICK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rick\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07979822\", \"14384587\"]}");
	add("{\"term\":\"rickenbacker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11281794\"]}");
	add("{\"term\":\"ricketiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04782801\"]}");
	add("{\"term\":\"rickets\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14224793\"]}");
	add("{\"term\":\"rickettsia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01374124\"]}");
	add("{\"term\":\"rickettsiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01373733\"]}");
	add("{\"term\":\"rickettsiales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01373554\"]}");
	add("{\"term\":\"rickettsialpox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14165394\"]}");
	add("{\"term\":\"rickettsiosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14164263\"]}");
	add("{\"term\":\"rickey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07948854\"]}");
	add("{\"term\":\"rickover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11281976\"]}");
	add("{\"term\":\"rickrack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04095705\"]}");
	add("{\"term\":\"ricksha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03604679\"]}");
	add("{\"term\":\"rickshaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03604679\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }