package org.swtk.commons.dict.wordnet.index.name.instance.c.e.r.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCERC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cercaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01928557\"]}");
	add("{\"term\":\"cercidiphyllaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11722897\"]}");
	add("{\"term\":\"cercidiphyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11723035\"]}");
	add("{\"term\":\"cercidium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12514204\"]}");
	add("{\"term\":\"cercis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12533931\"]}");
	add("{\"term\":\"cercocebus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02488496\"]}");
	add("{\"term\":\"cercopidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02260188\"]}");
	add("{\"term\":\"cercopithecidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02486546\"]}");
	add("{\"term\":\"cercopithecus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02487444\"]}");
	add("{\"term\":\"cercospora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13101434\"]}");
	add("{\"term\":\"cercosporella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13100535\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }