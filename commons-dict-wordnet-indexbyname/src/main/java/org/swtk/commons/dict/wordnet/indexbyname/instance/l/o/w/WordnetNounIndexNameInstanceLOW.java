package org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"low\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03354857\", \"05104968\", \"11162145\", \"14544431\"]}");
	add("{\"term\":\"lowan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01804120\"]}");
	add("{\"term\":\"lowboy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03699186\"]}");
	add("{\"term\":\"lowbrow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10442776\"]}");
	add("{\"term\":\"lowell\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"11162358\", \"11162507\", \"11162604\", \"11162778\"]}");
	add("{\"term\":\"lower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03699299\"]}");
	add("{\"term\":\"lowercase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06837807\"]}");
	add("{\"term\":\"lowerclassman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10294512\"]}");
	add("{\"term\":\"lowering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00328509\", \"00354295\"]}");
	add("{\"term\":\"lowland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09367095\"]}");
	add("{\"term\":\"lowlander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10294946\"]}");
	add("{\"term\":\"lowlands\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08912116\"]}");
	add("{\"term\":\"lowlife\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10559272\"]}");
	add("{\"term\":\"lowliness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13974433\", \"14459904\"]}");
	add("{\"term\":\"lowness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05105107\", \"05144822\", \"07553056\", \"13974433\"]}");
	add("{\"term\":\"lowry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11162912\", \"11163034\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }