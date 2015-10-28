package org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceADI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"adiantaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13200114\"]}");
	add("{\"term\":\"adiantum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13227482\"]}");
	add("{\"term\":\"adience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09203688\"]}");
	add("{\"term\":\"adieu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06642117\"]}");
	add("{\"term\":\"adige\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09210640\"]}");
	add("{\"term\":\"adios\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06642117\"]}");
	add("{\"term\":\"adiposeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05006906\"]}");
	add("{\"term\":\"adiposis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05007702\"]}");
	add("{\"term\":\"adiposity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05006906\"]}");
	add("{\"term\":\"adirondacks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09210820\"]}");
	add("{\"term\":\"adit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02683366\"]}");
	add("{\"term\":\"aditi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09547162\"]}");
	add("{\"term\":\"aditya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09547286\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }