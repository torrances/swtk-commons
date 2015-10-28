package org.swtk.commons.dict.wordnet.indexbyname.instance.g.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gun\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00124250\", \"02673313\", \"03461243\", \"10171603\", \"10612800\", \"02749370\", \"03472916\"]}");
	add("{\"term\":\"gunboat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03473502\"]}");
	add("{\"term\":\"guncotton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14819163\"]}");
	add("{\"term\":\"gunfight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00125437\"]}");
	add("{\"term\":\"gunfire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00124603\"]}");
	add("{\"term\":\"gunflint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03474278\"]}");
	add("{\"term\":\"gunite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14916661\"]}");
	add("{\"term\":\"gunk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14980800\"]}");
	add("{\"term\":\"gunlock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03474425\"]}");
	add("{\"term\":\"gunman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10612800\", \"10171603\"]}");
	add("{\"term\":\"gunmetal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14741795\"]}");
	add("{\"term\":\"gunnel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02617608\", \"03475925\"]}");
	add("{\"term\":\"gunner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09831257\"]}");
	add("{\"term\":\"gunnery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03474955\"]}");
	add("{\"term\":\"gunny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02926182\"]}");
	add("{\"term\":\"gunnysack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03475026\"]}");
	add("{\"term\":\"gunplay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00125437\"]}");
	add("{\"term\":\"gunpoint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03981127\"]}");
	add("{\"term\":\"gunpowder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15040881\"]}");
	add("{\"term\":\"gunrunner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10171960\"]}");
	add("{\"term\":\"gunrunning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01114194\"]}");
	add("{\"term\":\"gunshot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00124603\"]}");
	add("{\"term\":\"gunsight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03475510\"]}");
	add("{\"term\":\"gunslinger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10171603\"]}");
	add("{\"term\":\"gunsmith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10172048\"]}");
	add("{\"term\":\"gunstock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04329164\"]}");
	add("{\"term\":\"gunwale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03475925\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }