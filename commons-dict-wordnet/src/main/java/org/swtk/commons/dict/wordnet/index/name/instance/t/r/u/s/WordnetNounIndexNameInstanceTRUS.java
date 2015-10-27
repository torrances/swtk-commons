package org.swtk.commons.dict.wordnet.index.name.instance.t.r.u.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRUS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"truss\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03110118\", \"04499670\", \"04499880\"]}");
	add("{\"term\":\"trust\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"13952885\", \"05951915\", \"08253542\", \"04902441\", \"05705941\", \"13381671\"]}");
	add("{\"term\":\"trustbuster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10751869\"]}");
	add("{\"term\":\"trustee\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10535887\", \"10751971\"]}");
	add("{\"term\":\"trusteeship\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00606545\", \"08693533\"]}");
	add("{\"term\":\"truster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09867897\"]}");
	add("{\"term\":\"trustfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04902441\"]}");
	add("{\"term\":\"trustiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04676176\"]}");
	add("{\"term\":\"trustingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04902441\"]}");
	add("{\"term\":\"trustor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10603473\"]}");
	add("{\"term\":\"trustworthiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04676176\"]}");
	add("{\"term\":\"trusty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10752178\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }