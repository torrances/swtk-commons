package org.swtk.commons.dict.wordnet.index.name.instance.b.i.r.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBIRD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bird\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04219349\", \"07138578\", \"10008583\", \"07659991\", \"01505702\"]}");
	add("{\"term\":\"birdbath\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02846396\"]}");
	add("{\"term\":\"birdbrain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10618312\"]}");
	add("{\"term\":\"birdcage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02846514\"]}");
	add("{\"term\":\"birdcall\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02846703\", \"06809500\"]}");
	add("{\"term\":\"birder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09875906\"]}");
	add("{\"term\":\"birdfeeder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02846791\"]}");
	add("{\"term\":\"birdhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02846922\"]}");
	add("{\"term\":\"birdie\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04219349\", \"13616519\"]}");
	add("{\"term\":\"birdlime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14726864\"]}");
	add("{\"term\":\"birdnest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09244478\"]}");
	add("{\"term\":\"birdnesting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00713052\"]}");
	add("{\"term\":\"birdseed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07821570\"]}");
	add("{\"term\":\"birdsong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06809500\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }