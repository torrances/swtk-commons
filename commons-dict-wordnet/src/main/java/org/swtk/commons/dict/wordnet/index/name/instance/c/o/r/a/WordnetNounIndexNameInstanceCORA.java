package org.swtk.commons.dict.wordnet.index.name.instance.c.o.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCORA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09592596\"]}");
	add("{\"term\":\"coracan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12139178\"]}");
	add("{\"term\":\"coracias\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01829183\"]}");
	add("{\"term\":\"coraciidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01828864\"]}");
	add("{\"term\":\"coraciiformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01828058\"]}");
	add("{\"term\":\"coracle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03109957\"]}");
	add("{\"term\":\"coragyps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01622923\"]}");
	add("{\"term\":\"corakan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12139178\"]}");
	add("{\"term\":\"coral\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01918452\", \"07809771\", \"14847206\", \"04979087\"]}");
	add("{\"term\":\"coralbells\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12819670\"]}");
	add("{\"term\":\"coralberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12117913\", \"12698602\"]}");
	add("{\"term\":\"corallorhiza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12073607\"]}");
	add("{\"term\":\"coralroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11902706\"]}");
	add("{\"term\":\"coralwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11779268\"]}");
	add("{\"term\":\"coralwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11902706\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }