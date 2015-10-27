package org.swtk.commons.dict.wordnet.index.name.instance.t.w.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTWIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"twin\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03122590\", \"09487465\", \"09771850\", \"10754051\"]}");
	add("{\"term\":\"twinberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12689278\", \"12696477\"]}");
	add("{\"term\":\"twine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04345112\"]}");
	add("{\"term\":\"twiner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10754225\"]}");
	add("{\"term\":\"twinflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12694089\"]}");
	add("{\"term\":\"twinge\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05733214\", \"07510112\"]}");
	add("{\"term\":\"twinjet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04510794\"]}");
	add("{\"term\":\"twinkie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07648288\"]}");
	add("{\"term\":\"twinkle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04960557\", \"07426245\"]}");
	add("{\"term\":\"twinkler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09487616\"]}");
	add("{\"term\":\"twinkling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15271921\"]}");
	add("{\"term\":\"twins\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08704233\", \"14907668\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }