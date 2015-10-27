package org.swtk.commons.dict.wordnet.index.name.instance.b.i.t.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBITT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bitt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02867933\"]}");
	add("{\"term\":\"bittacidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02165483\"]}");
	add("{\"term\":\"bitter\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05002002\", \"05725062\", \"07905789\"]}");
	add("{\"term\":\"bittercress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11902211\"]}");
	add("{\"term\":\"bittern\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02014114\"]}");
	add("{\"term\":\"bitterness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05002002\", \"05725062\", \"04650754\", \"07564444\"]}");
	add("{\"term\":\"bitternut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12341323\"]}");
	add("{\"term\":\"bitterroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11881024\"]}");
	add("{\"term\":\"bitters\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07919341\"]}");
	add("{\"term\":\"bittersweet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12769008\", \"12915367\"]}");
	add("{\"term\":\"bitterweed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11939916\", \"12023636\"]}");
	add("{\"term\":\"bitterwood\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12737354\", \"12739243\", \"12739755\"]}");
	add("{\"term\":\"bitthead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02849001\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }