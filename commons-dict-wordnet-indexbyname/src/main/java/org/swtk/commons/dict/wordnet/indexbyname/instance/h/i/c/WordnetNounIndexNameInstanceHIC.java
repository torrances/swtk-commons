package org.swtk.commons.dict.wordnet.indexbyname.instance.h.i.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHIC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hiccough\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14382864\"]}");
	add("{\"term\":\"hiccough nut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12344739\"]}");
	add("{\"term\":\"hiccup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14382864\"]}");
	add("{\"term\":\"hiccup nut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12344739\"]}");
	add("{\"term\":\"hick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10823706\"]}");
	add("{\"term\":\"hickey\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14250344\", \"14357711\"]}");
	add("{\"term\":\"hickock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11069438\"]}");
	add("{\"term\":\"hickory\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12340527\", \"12340802\"]}");
	add("{\"term\":\"hickory nut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07790271\"]}");
	add("{\"term\":\"hickory pine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11638082\"]}");
	add("{\"term\":\"hickory tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12340527\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }