package org.swtk.commons.dict.wordnet.index.name.instance.s.a.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSALE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sale\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06539842\", \"14587887\", \"01120044\", \"01119862\", \"01116934\"]}");
	add("{\"term\":\"salem\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08924826\", \"09121856\", \"09156897\"]}");
	add("{\"term\":\"saleratus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14800154\"]}");
	add("{\"term\":\"salerno\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01296143\"]}");
	add("{\"term\":\"saleroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04216878\"]}");
	add("{\"term\":\"sales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13281835\"]}");
	add("{\"term\":\"salesclerk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10567784\"]}");
	add("{\"term\":\"salesgirl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10567976\"]}");
	add("{\"term\":\"saleslady\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10567976\"]}");
	add("{\"term\":\"salesman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10568094\"]}");
	add("{\"term\":\"salesmanship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05647496\"]}");
	add("{\"term\":\"salesperson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10568238\"]}");
	add("{\"term\":\"salesroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04216878\"]}");
	add("{\"term\":\"saleswoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10567976\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }