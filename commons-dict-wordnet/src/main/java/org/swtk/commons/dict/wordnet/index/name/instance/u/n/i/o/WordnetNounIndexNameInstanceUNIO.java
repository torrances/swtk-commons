package org.swtk.commons.dict.wordnet.index.name.instance.u.n.i.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUNIO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"unio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01967462\"]}");
	add("{\"term\":\"union\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"00382488\", \"04517110\", \"07387877\", \"08015154\", \"08321825\", \"13592568\", \"13987306\", \"14441799\", \"00848970\", \"09074770\", \"08249977\"]}");
	add("{\"term\":\"unionidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01967277\"]}");
	add("{\"term\":\"unionisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00243450\"]}");
	add("{\"term\":\"unionism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08490493\"]}");
	add("{\"term\":\"unionist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10740613\"]}");
	add("{\"term\":\"unionization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00243450\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }