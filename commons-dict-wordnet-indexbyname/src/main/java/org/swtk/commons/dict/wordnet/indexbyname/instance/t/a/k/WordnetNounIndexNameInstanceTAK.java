package org.swtk.commons.dict.wordnet.indexbyname.instance.t.a.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTAK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"taka\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13730119\"]}");
	add("{\"term\":\"takahe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02020379\"]}");
	add("{\"term\":\"takakkaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09476848\"]}");
	add("{\"term\":\"take\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00909831\", \"13281089\"]}");
	add("{\"term\":\"takeaway\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00557871\", \"07231777\", \"07610082\"]}");
	add("{\"term\":\"takedown\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06729735\", \"07486654\"]}");
	add("{\"term\":\"takelma\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06938315\", \"09689756\"]}");
	add("{\"term\":\"takeoff\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00550647\", \"06793148\", \"07390235\", \"00306928\"]}");
	add("{\"term\":\"takeout\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06750377\", \"07610082\"]}");
	add("{\"term\":\"takeover\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00791567\", \"01147528\"]}");
	add("{\"term\":\"taker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09871489\", \"10709280\"]}");
	add("{\"term\":\"takilman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06938315\"]}");
	add("{\"term\":\"takin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02422280\"]}");
	add("{\"term\":\"taking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00715729\"]}");
	add("{\"term\":\"takings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13281089\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }