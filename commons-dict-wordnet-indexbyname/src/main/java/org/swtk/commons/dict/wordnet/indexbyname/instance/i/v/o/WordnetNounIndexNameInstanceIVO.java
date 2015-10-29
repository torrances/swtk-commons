package org.swtk.commons.dict.wordnet.indexbyname.instance.i.v.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIVO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ivor armstrong richards\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11280935\"]}");
	add("{\"term\":\"ivory\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04968508\", \"14781726\"]}");
	add("{\"term\":\"ivory black\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14943034\"]}");
	add("{\"term\":\"ivory coast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08754350\"]}");
	add("{\"term\":\"ivory coast franc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13700103\"]}");
	add("{\"term\":\"ivory gull\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02045126\"]}");
	add("{\"term\":\"ivory nut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12615294\"]}");
	add("{\"term\":\"ivory palm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12615085\"]}");
	add("{\"term\":\"ivory plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12615085\"]}");
	add("{\"term\":\"ivory tower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05682771\"]}");
	add("{\"term\":\"ivory tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11793348\"]}");
	add("{\"term\":\"ivorybill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01843053\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }