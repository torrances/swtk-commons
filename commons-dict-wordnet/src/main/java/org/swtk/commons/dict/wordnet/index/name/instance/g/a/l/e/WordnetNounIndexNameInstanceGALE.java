package org.swtk.commons.dict.wordnet.index.name.instance.g.a.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGALE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11482224\"]}");
	add("{\"term\":\"galea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13032221\"]}");
	add("{\"term\":\"galega\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12549858\"]}");
	add("{\"term\":\"galen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11007561\"]}");
	add("{\"term\":\"galena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14700071\"]}");
	add("{\"term\":\"galeocerdo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01493876\"]}");
	add("{\"term\":\"galeopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12867629\"]}");
	add("{\"term\":\"galeorhinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01494161\"]}");
	add("{\"term\":\"galeras\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09198219\"]}");
	add("{\"term\":\"galere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08423216\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }