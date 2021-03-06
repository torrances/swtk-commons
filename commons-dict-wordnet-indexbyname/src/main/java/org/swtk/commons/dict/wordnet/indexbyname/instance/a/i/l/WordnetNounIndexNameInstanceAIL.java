package org.swtk.commons.dict.wordnet.indexbyname.instance.a.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07834253\"]}");
	add("{\"term\":\"ailanthus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12737832\"]}");
	add("{\"term\":\"ailanthus altissima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12737984\"]}");
	add("{\"term\":\"ailanthus silkworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02306429\"]}");
	add("{\"term\":\"aileron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02688112\"]}");
	add("{\"term\":\"ailey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10830275\"]}");
	add("{\"term\":\"ailment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14078890\"]}");
	add("{\"term\":\"ailurophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14408407\"]}");
	add("{\"term\":\"ailuropoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02512871\"]}");
	add("{\"term\":\"ailuropoda melanoleuca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02513086\"]}");
	add("{\"term\":\"ailuropodidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02512696\"]}");
	add("{\"term\":\"ailurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02512325\"]}");
	add("{\"term\":\"ailurus fulgens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02512446\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }