package org.swtk.commons.dict.wordnet.index.name.instance.l.i.g.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIGH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"light\", \"synsetCount\":15, \"upperType\":\"NOUN\", \"ids\":[\"03671917\", \"06887069\", \"09207565\", \"05620489\", \"04960557\", \"05815941\", \"14006789\", \"10296356\", \"04958550\", \"14587365\", \"08663763\", \"05025269\", \"06220526\", \"03670692\", \"11494354\"]}");
	add("{\"term\":\"lightbulb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03671250\"]}");
	add("{\"term\":\"lightening\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00274721\", \"07377780\"]}");
	add("{\"term\":\"lighter\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02795575\", \"03671917\", \"15125928\"]}");
	add("{\"term\":\"lighterage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00653197\", \"13343542\"]}");
	add("{\"term\":\"lighterman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10281085\"]}");
	add("{\"term\":\"lightheadedness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04901639\", \"14395918\"]}");
	add("{\"term\":\"lightheartedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07546254\"]}");
	add("{\"term\":\"lighthouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02817995\"]}");
	add("{\"term\":\"lighting\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00379287\", \"00609913\", \"03672561\", \"14006789\"]}");
	add("{\"term\":\"lightlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14007292\"]}");
	add("{\"term\":\"lightness\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04655953\", \"04958550\", \"04987007\", \"05011015\", \"05035866\", \"07543044\"]}");
	add("{\"term\":\"lightning\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07427593\", \"11495679\"]}");
	add("{\"term\":\"lightship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03673814\"]}");
	add("{\"term\":\"lightsomeness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04655953\", \"05011015\", \"07546254\"]}");
	add("{\"term\":\"lightweight\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"10282258\", \"10282352\", \"10796655\", \"10282142\"]}");
	add("{\"term\":\"lightwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11778591\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }