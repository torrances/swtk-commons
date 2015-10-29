package org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"liomys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02352382\"]}");
	add("{\"term\":\"liomys irroratus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02352499\"]}");
	add("{\"term\":\"lion\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08704559\", \"09772126\", \"10284767\", \"02131817\"]}");
	add("{\"term\":\"lion cub\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01325389\"]}");
	add("{\"term\":\"lion marmoset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02493738\"]}");
	add("{\"term\":\"lion monkey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02493738\"]}");
	add("{\"term\":\"lionel barrymore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10855305\"]}");
	add("{\"term\":\"lionel hampton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11047123\"]}");
	add("{\"term\":\"lionel trilling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11369087\"]}");
	add("{\"term\":\"lioness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02132115\"]}");
	add("{\"term\":\"lionet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02132182\"]}");
	add("{\"term\":\"lionfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02646196\"]}");
	add("{\"term\":\"lions club\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08252948\"]}");
	add("{\"term\":\"liopelma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01647919\"]}");
	add("{\"term\":\"liopelma hamiltoni\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01648107\"]}");
	add("{\"term\":\"liopelmidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01647734\"]}");
	add("{\"term\":\"liothyronine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05421216\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }