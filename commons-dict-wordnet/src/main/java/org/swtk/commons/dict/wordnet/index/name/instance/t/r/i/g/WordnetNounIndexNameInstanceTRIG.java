package org.swtk.commons.dict.wordnet.index.name.instance.t.r.i.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRIG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"trig\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06021862\"]}");
	add("{\"term\":\"triga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02652912\"]}");
	add("{\"term\":\"trigeminal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05486548\"]}");
	add("{\"term\":\"trigeminus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05486548\"]}");
	add("{\"term\":\"trigger\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00157210\", \"04490329\", \"03475752\"]}");
	add("{\"term\":\"triggerfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02655775\"]}");
	add("{\"term\":\"triggerman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10171603\"]}");
	add("{\"term\":\"triglidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02652319\"]}");
	add("{\"term\":\"triglinae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02653326\"]}");
	add("{\"term\":\"triglochin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12638145\"]}");
	add("{\"term\":\"triglyceride\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14909520\"]}");
	add("{\"term\":\"trigon\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04490466\", \"08003213\", \"13901977\"]}");
	add("{\"term\":\"trigonella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12594648\"]}");
	add("{\"term\":\"trigonometrician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10749094\"]}");
	add("{\"term\":\"trigonometry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06021862\"]}");
	add("{\"term\":\"trigram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06372130\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }