package org.swtk.commons.dict.wordnet.indexbyname.instance.r.a.j;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRAJ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"raj\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14466811\"]}");
	add("{\"term\":\"raja\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01504091\", \"10525325\"]}");
	add("{\"term\":\"raja batis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01504282\"]}");
	add("{\"term\":\"raja erinacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01504418\"]}");
	add("{\"term\":\"raja laevis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01504742\"]}");
	add("{\"term\":\"raja radiata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01504589\"]}");
	add("{\"term\":\"rajab\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15242833\"]}");
	add("{\"term\":\"rajah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10525325\"]}");
	add("{\"term\":\"rajanya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08324075\"]}");
	add("{\"term\":\"rajidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01503636\"]}");
	add("{\"term\":\"rajiformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01499258\"]}");
	add("{\"term\":\"rajpoot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10525409\"]}");
	add("{\"term\":\"rajput\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10525409\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }