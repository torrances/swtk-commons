package org.swtk.commons.dict.wordnet.indexbyname.instance.p.s.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePSO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"psoas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05582493\"]}");
	add("{\"term\":\"psocid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02263515\"]}");
	add("{\"term\":\"psocidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02263275\"]}");
	add("{\"term\":\"psocoptera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02262835\"]}");
	add("{\"term\":\"psocopterous insect\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02263073\"]}");
	add("{\"term\":\"psophia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02023556\"]}");
	add("{\"term\":\"psophia crepitans\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02023935\"]}");
	add("{\"term\":\"psophiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02023431\"]}");
	add("{\"term\":\"psophocarpus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12584418\"]}");
	add("{\"term\":\"psophocarpus tetragonolobus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12584588\"]}");
	add("{\"term\":\"psoralea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12584886\"]}");
	add("{\"term\":\"psoralea esculenta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12585118\"]}");
	add("{\"term\":\"psoriasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14255276\"]}");
	add("{\"term\":\"psoriatic arthritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14211351\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }