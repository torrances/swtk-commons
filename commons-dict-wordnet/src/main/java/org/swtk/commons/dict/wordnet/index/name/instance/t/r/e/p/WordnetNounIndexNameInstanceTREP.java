package org.swtk.commons.dict.wordnet.index.name.instance.t.r.e.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTREP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"trepan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04486640\", \"04486761\"]}");
	add("{\"term\":\"trepang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02324699\"]}");
	add("{\"term\":\"trephination\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00695529\"]}");
	add("{\"term\":\"trephine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04486761\"]}");
	add("{\"term\":\"trephritidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02199194\"]}");
	add("{\"term\":\"trepidation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07537282\"]}");
	add("{\"term\":\"treponema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01385340\"]}");
	add("{\"term\":\"treponemataceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01384914\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }