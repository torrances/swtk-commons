package org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceELD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"el dorado\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05635297\"]}");
	add("{\"term\":\"eld\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15170131\", \"15178747\"]}");
	add("{\"term\":\"elder\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10068175\", \"12698985\", \"10068026\"]}");
	add("{\"term\":\"elder hand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10068537\"]}");
	add("{\"term\":\"elder statesman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10068293\", \"10068420\"]}");
	add("{\"term\":\"elderberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07781184\", \"12699962\"]}");
	add("{\"term\":\"elderberry bush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12698985\"]}");
	add("{\"term\":\"elderly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07960146\"]}");
	add("{\"term\":\"eldership\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00593314\"]}");
	add("{\"term\":\"eldest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10112412\"]}");
	add("{\"term\":\"eldest hand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10068537\"]}");
	add("{\"term\":\"eldorado\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05635297\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }