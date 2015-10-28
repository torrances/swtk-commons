package org.swtk.commons.dict.wordnet.indexbyname.instance.s.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSOD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sod\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"10172934\", \"10640876\", \"15089592\", \"09487049\"]}");
	add("{\"term\":\"soda\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07943752\", \"15069411\"]}");
	add("{\"term\":\"sodalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10640762\"]}");
	add("{\"term\":\"sodalite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15069215\"]}");
	add("{\"term\":\"sodality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08092224\"]}");
	add("{\"term\":\"sodbuster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10098586\"]}");
	add("{\"term\":\"soddy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11327582\", \"04263009\"]}");
	add("{\"term\":\"sodium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14679550\"]}");
	add("{\"term\":\"sodoku\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14591271\"]}");
	add("{\"term\":\"sodom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08813506\", \"08813732\"]}");
	add("{\"term\":\"sodomist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10640876\"]}");
	add("{\"term\":\"sodomite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10640876\"]}");
	add("{\"term\":\"sodomy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00850924\", \"00859689\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }