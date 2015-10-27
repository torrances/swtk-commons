package org.swtk.commons.dict.wordnet.index.name.instance.s.t.e.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTEN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"stench\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05722841\"]}");
	add("{\"term\":\"stencil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04321354\"]}");
	add("{\"term\":\"stendhal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11336244\"]}");
	add("{\"term\":\"stengel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11336424\"]}");
	add("{\"term\":\"stenocarpus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12243232\"]}");
	add("{\"term\":\"stenochlaena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13206896\"]}");
	add("{\"term\":\"stenograph\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04321770\", \"06854337\"]}");
	add("{\"term\":\"stenographer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10673454\"]}");
	add("{\"term\":\"stenography\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00616749\", \"06361497\"]}");
	add("{\"term\":\"stenopelmatidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02231526\"]}");
	add("{\"term\":\"stenopelmatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02231675\"]}");
	add("{\"term\":\"stenopterygius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01727727\"]}");
	add("{\"term\":\"stenosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14130856\"]}");
	add("{\"term\":\"stenotaphrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12161554\"]}");
	add("{\"term\":\"stenotomus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02595983\"]}");
	add("{\"term\":\"stenotus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12039659\"]}");
	add("{\"term\":\"stent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04321873\"]}");
	add("{\"term\":\"stentor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01399258\", \"09514915\", \"10673650\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }