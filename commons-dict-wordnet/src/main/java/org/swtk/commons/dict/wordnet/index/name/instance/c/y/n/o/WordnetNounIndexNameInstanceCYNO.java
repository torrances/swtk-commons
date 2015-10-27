package org.swtk.commons.dict.wordnet.index.name.instance.c.y.n.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCYNO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cynocephalidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02504843\"]}");
	add("{\"term\":\"cynocephalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02504988\"]}");
	add("{\"term\":\"cynodon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12136080\"]}");
	add("{\"term\":\"cynodont\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01723408\"]}");
	add("{\"term\":\"cynodontia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01723137\"]}");
	add("{\"term\":\"cynoglossidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02665982\"]}");
	add("{\"term\":\"cynoglossum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12839502\"]}");
	add("{\"term\":\"cynomys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02361856\"]}");
	add("{\"term\":\"cynophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14408487\"]}");
	add("{\"term\":\"cynopterus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02143371\"]}");
	add("{\"term\":\"cynoscephalae\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01279558\", \"08808051\"]}");
	add("{\"term\":\"cynoscion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02601837\"]}");
	add("{\"term\":\"cynosure\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05820748\", \"06663890\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }