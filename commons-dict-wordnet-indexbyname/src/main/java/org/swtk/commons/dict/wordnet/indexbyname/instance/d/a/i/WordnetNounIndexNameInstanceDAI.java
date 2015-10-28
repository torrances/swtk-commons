package org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDAI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"daikon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11915561\"]}");
	add("{\"term\":\"dail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08336469\"]}");
	add("{\"term\":\"daily\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06278217\"]}");
	add("{\"term\":\"daimler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10940761\"]}");
	add("{\"term\":\"daimon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09565450\"]}");
	add("{\"term\":\"daintiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04820315\"]}");
	add("{\"term\":\"dainty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07572730\"]}");
	add("{\"term\":\"daiquiri\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07930653\"]}");
	add("{\"term\":\"dairen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08744836\"]}");
	add("{\"term\":\"dairy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03164201\"]}");
	add("{\"term\":\"dairying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00920103\"]}");
	add("{\"term\":\"dairymaid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10007754\"]}");
	add("{\"term\":\"dairyman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10007849\", \"10007930\"]}");
	add("{\"term\":\"dais\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03164306\"]}");
	add("{\"term\":\"daishiki\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03168047\"]}");
	add("{\"term\":\"daisy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11959960\"]}");
	add("{\"term\":\"daisybush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12018438\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }