package org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rolaids\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14802015\"]}");
	add("{\"term\":\"role\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00723312\", \"05156572\", \"05937794\", \"00721817\"]}");
	add("{\"term\":\"roleplaying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00553134\"]}");
	add("{\"term\":\"rolf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11289226\"]}");
	add("{\"term\":\"roll\", \"synsetCount\":15, \"upperType\":\"NOUN\", \"ids\":[\"00105229\", \"00171161\", \"00290503\", \"01248360\", \"04108326\", \"06419376\", \"07403416\", \"07403930\", \"07696677\", \"13377742\", \"13898609\", \"04108469\", \"07364132\", \"06506991\", \"07456219\"]}");
	add("{\"term\":\"rollback\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00363084\", \"00982865\"]}");
	add("{\"term\":\"roller\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"01817396\", \"01829005\", \"03154898\", \"04108591\", \"04108795\", \"07364132\", \"00130255\"]}");
	add("{\"term\":\"rollerblade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04109256\"]}");
	add("{\"term\":\"rollerblader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10556575\"]}");
	add("{\"term\":\"rollerblading\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00449857\"]}");
	add("{\"term\":\"rolling\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00123350\", \"00785416\", \"07403930\"]}");
	add("{\"term\":\"rollmops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07801463\"]}");
	add("{\"term\":\"rollo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11289226\"]}");
	add("{\"term\":\"rollover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01158209\"]}");
	add("{\"term\":\"rolodex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04111241\"]}");
	add("{\"term\":\"rolypoliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05008254\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }