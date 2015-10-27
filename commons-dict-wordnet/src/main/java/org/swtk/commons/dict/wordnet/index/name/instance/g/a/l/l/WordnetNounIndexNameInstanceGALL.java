package org.swtk.commons.dict.wordnet.index.name.instance.g.a.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGALL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gall\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04923043\", \"05413913\", \"07564444\", \"13120345\", \"14207872\", \"14298742\"]}");
	add("{\"term\":\"gallamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14883773\"]}");
	add("{\"term\":\"gallant\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10663501\", \"10010564\"]}");
	add("{\"term\":\"gallantry\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01231281\", \"04920915\", \"04864969\"]}");
	add("{\"term\":\"gallaudet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11008055\"]}");
	add("{\"term\":\"gallberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12778218\"]}");
	add("{\"term\":\"gallbladder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05392504\"]}");
	add("{\"term\":\"galleon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03416249\"]}");
	add("{\"term\":\"galleria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02291829\"]}");
	add("{\"term\":\"gallery\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"03244102\", \"03416454\", \"03416672\", \"03416837\", \"03416968\", \"04534943\", \"08239124\"]}");
	add("{\"term\":\"galley\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03417130\", \"03417297\", \"03417421\", \"03417584\"]}");
	add("{\"term\":\"gallfly\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02164240\", \"02192015\", \"02219392\"]}");
	add("{\"term\":\"gallia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08949495\"]}");
	add("{\"term\":\"galliano\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07925954\"]}");
	add("{\"term\":\"gallicanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08492081\"]}");
	add("{\"term\":\"gallicism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07095838\"]}");
	add("{\"term\":\"galliformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01791705\"]}");
	add("{\"term\":\"gallimaufry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08416934\"]}");
	add("{\"term\":\"gallina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01793748\"]}");
	add("{\"term\":\"gallinacean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01792027\"]}");
	add("{\"term\":\"gallinago\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02034406\"]}");
	add("{\"term\":\"gallinula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02018852\"]}");
	add("{\"term\":\"gallinule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02019012\"]}");
	add("{\"term\":\"gallirallus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02017875\"]}");
	add("{\"term\":\"gallium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14662434\"]}");
	add("{\"term\":\"gallon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13643490\", \"13641045\"]}");
	add("{\"term\":\"gallop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00289515\"]}");
	add("{\"term\":\"gallous\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03418034\"]}");
	add("{\"term\":\"galloway\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02409928\", \"08912285\"]}");
	add("{\"term\":\"gallows\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03417816\"]}");
	add("{\"term\":\"gallstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09309106\"]}");
	add("{\"term\":\"gallup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09138416\"]}");
	add("{\"term\":\"gallus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01793584\", \"02890730\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }