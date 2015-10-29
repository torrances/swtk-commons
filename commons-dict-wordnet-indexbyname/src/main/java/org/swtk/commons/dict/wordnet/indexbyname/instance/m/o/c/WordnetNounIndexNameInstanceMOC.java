package org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMOC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mocambique\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08993376\"]}");
	add("{\"term\":\"mocassin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03782410\"]}");
	add("{\"term\":\"moccasin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03782410\"]}");
	add("{\"term\":\"moccasin flower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12077102\"]}");
	add("{\"term\":\"mocha\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04980217\", \"07937112\", \"07937229\", \"14787148\"]}");
	add("{\"term\":\"mocha coffee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07937112\"]}");
	add("{\"term\":\"mock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01227189\"]}");
	add("{\"term\":\"mock azalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11789645\"]}");
	add("{\"term\":\"mock orange\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"12420404\", \"12663874\", \"12793668\", \"12812089\"]}");
	add("{\"term\":\"mock privet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12330538\"]}");
	add("{\"term\":\"mock sun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11508132\"]}");
	add("{\"term\":\"mock turtle soup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07601750\"]}");
	add("{\"term\":\"mocker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01589582\", \"10580748\"]}");
	add("{\"term\":\"mockernut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12342616\"]}");
	add("{\"term\":\"mockernut hickory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12342616\"]}");
	add("{\"term\":\"mockery\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00550647\", \"06793148\", \"06729173\"]}");
	add("{\"term\":\"mocking thrush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01590475\"]}");
	add("{\"term\":\"mockingbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01589582\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }