package org.swtk.commons.dict.wordnet.index.name.instance.t.o.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOLL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"toll\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07391844\", \"05171334\", \"13344771\"]}");
	add("{\"term\":\"tollbar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04456821\"]}");
	add("{\"term\":\"tollbooth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04456561\"]}");
	add("{\"term\":\"toller\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10734333\", \"10734500\"]}");
	add("{\"term\":\"tollgate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04456821\"]}");
	add("{\"term\":\"tollgatherer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10734333\"]}");
	add("{\"term\":\"tollhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04456561\"]}");
	add("{\"term\":\"tollkeeper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10734333\"]}");
	add("{\"term\":\"tollman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10734333\"]}");
	add("{\"term\":\"tollon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12653822\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }