package org.swtk.commons.dict.wordnet.indexbyname.instance.r.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"run\", \"synsetCount\":16, \"upperType\":\"NOUN\", \"ids\":[\"00309837\", \"05052992\", \"07422377\", \"07457610\", \"07488069\", \"09438816\", \"13782269\", \"14019420\", \"15286931\", \"00294760\", \"00309697\", \"00559920\", \"08477596\", \"07475061\", \"00792739\", \"00190414\"]}");
	add("{\"term\":\"runabout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04104467\"]}");
	add("{\"term\":\"runaway\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10134739\", \"07490247\"]}");
	add("{\"term\":\"runch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11915027\"]}");
	add("{\"term\":\"rundle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04126845\"]}");
	add("{\"term\":\"rundown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06481545\"]}");
	add("{\"term\":\"rundstedt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11293669\"]}");
	add("{\"term\":\"rune\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06853237\"]}");
	add("{\"term\":\"rung\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04126845\", \"04126986\"]}");
	add("{\"term\":\"runnel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09438816\"]}");
	add("{\"term\":\"runner\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"02579795\", \"04127187\", \"04127360\", \"09853766\", \"10562445\", \"13148602\", \"09861084\", \"10562165\", \"10562318\", \"10634850\"]}");
	add("{\"term\":\"runniness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04944220\"]}");
	add("{\"term\":\"running\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00440979\", \"01139306\", \"14032966\", \"00294760\", \"00559920\"]}");
	add("{\"term\":\"runoff\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00184206\", \"07421872\"]}");
	add("{\"term\":\"runt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10563101\"]}");
	add("{\"term\":\"runtiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05114795\"]}");
	add("{\"term\":\"runup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07428970\"]}");
	add("{\"term\":\"runway\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04127936\", \"04128092\", \"04128236\", \"04470914\"]}");
	add("{\"term\":\"runyon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11293897\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }