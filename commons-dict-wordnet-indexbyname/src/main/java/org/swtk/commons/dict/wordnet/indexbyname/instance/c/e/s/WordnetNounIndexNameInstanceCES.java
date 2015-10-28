package org.swtk.commons.dict.wordnet.indexbyname.instance.c.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cesarean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00186627\"]}");
	add("{\"term\":\"cesarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00186627\"]}");
	add("{\"term\":\"cesium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14658410\"]}");
	add("{\"term\":\"cessation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07376675\"]}");
	add("{\"term\":\"cession\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00213901\"]}");
	add("{\"term\":\"cesspit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03002170\"]}");
	add("{\"term\":\"cesspool\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03002170\"]}");
	add("{\"term\":\"cestida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01923223\"]}");
	add("{\"term\":\"cestidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01923376\"]}");
	add("{\"term\":\"cestoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01929942\"]}");
	add("{\"term\":\"cestode\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01930097\"]}");
	add("{\"term\":\"cestrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12923057\"]}");
	add("{\"term\":\"cestum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01923580\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }