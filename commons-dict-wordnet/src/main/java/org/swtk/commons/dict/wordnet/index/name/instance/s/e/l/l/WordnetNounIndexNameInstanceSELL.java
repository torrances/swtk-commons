package org.swtk.commons.dict.wordnet.index.name.instance.s.e.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSELL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01117483\"]}");
	add("{\"term\":\"seller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10596736\"]}");
	add("{\"term\":\"sellers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11312095\"]}");
	add("{\"term\":\"selling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01115160\"]}");
	add("{\"term\":\"selloff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01122270\"]}");
	add("{\"term\":\"sellotape\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02996250\"]}");
	add("{\"term\":\"sellout\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00751514\", \"01117127\", \"07470798\", \"09851585\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }