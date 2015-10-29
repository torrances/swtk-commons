package org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJOB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"job\", \"synsetCount\":13, \"upperType\":\"NOUN\", \"ids\":[\"00784446\", \"06448609\", \"06584658\", \"10242619\", \"11105392\", \"14434009\", \"00577754\", \"00577914\", \"00585806\", \"03604953\", \"03604821\", \"00720957\", \"00583425\"]}");
	add("{\"term\":\"job action\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01244711\"]}");
	add("{\"term\":\"job application\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06524848\"]}");
	add("{\"term\":\"job candidate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10242386\"]}");
	add("{\"term\":\"job control\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06588329\"]}");
	add("{\"term\":\"job description\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06737691\"]}");
	add("{\"term\":\"job interview\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07211065\"]}");
	add("{\"term\":\"job lot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08023872\"]}");
	add("{\"term\":\"jobber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10242167\"]}");
	add("{\"term\":\"jobbery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04882663\"]}");
	add("{\"term\":\"jobcentre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03605156\"]}");
	add("{\"term\":\"jobholder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10242492\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }