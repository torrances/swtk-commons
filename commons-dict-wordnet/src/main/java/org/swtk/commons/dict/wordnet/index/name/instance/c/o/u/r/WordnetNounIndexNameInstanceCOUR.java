package org.swtk.commons.dict.wordnet.index.name.instance.c.o.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"courage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04864314\"]}");
	add("{\"term\":\"courageousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04864314\"]}");
	add("{\"term\":\"courante\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00527700\"]}");
	add("{\"term\":\"courbaril\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11770977\"]}");
	add("{\"term\":\"courbet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10932955\"]}");
	add("{\"term\":\"courgette\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07732103\", \"12180321\"]}");
	add("{\"term\":\"courier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10330688\"]}");
	add("{\"term\":\"courlan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02016221\"]}");
	add("{\"term\":\"course\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"03124441\", \"03124680\", \"07572535\", \"08255384\", \"09410115\", \"00039000\", \"08698960\", \"08393816\", \"00886144\"]}");
	add("{\"term\":\"courser\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02041825\", \"02089966\", \"02381277\", \"09991212\"]}");
	add("{\"term\":\"coursework\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00886766\"]}");
	add("{\"term\":\"coursing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00454150\"]}");
	add("{\"term\":\"court\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"01231712\", \"03124849\", \"03125691\", \"03654773\", \"03796288\", \"08346249\", \"10933107\", \"03125142\", \"08068698\", \"03125429\", \"08346380\"]}");
	add("{\"term\":\"courtelle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03125841\"]}");
	add("{\"term\":\"courtesan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09971872\"]}");
	add("{\"term\":\"courtesy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04919909\", \"06727813\", \"01230734\"]}");
	add("{\"term\":\"courthouse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03125949\", \"03126082\"]}");
	add("{\"term\":\"courtier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09991369\"]}");
	add("{\"term\":\"courting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07203345\"]}");
	add("{\"term\":\"courtliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04820532\"]}");
	add("{\"term\":\"courtroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03125429\"]}");
	add("{\"term\":\"courtship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07203345\"]}");
	add("{\"term\":\"courtyard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03124849\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }