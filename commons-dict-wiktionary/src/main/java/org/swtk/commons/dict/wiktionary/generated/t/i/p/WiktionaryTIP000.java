package org.swtk.commons.dict.wiktionary.generated.t.i.p;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTIP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tipcat", "{\"term\":\"tipcat\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|tip|cat|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An old game in which a small piece of wood, pointed at both ends, called a \u0026quot;cat\u0026quot;, is tipped, or struck with a stick or bat, to make it travel through the air as far as possible\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"In the middle of a game at \u0027\u0027tipcat\u0027\u0027, he paused, and stood staring wildly upward with his stick in his hand.\u0027 \u0026amp;mdash; Macaulay\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The wooden stick used in this game\", \"priority\":3}]}, \"synonyms\":{}}");

	add("tiple", "{\"term\":\"tiple\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\"], \"text\":\"From Spanish \u0027tiple\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several kinds of small, plucked stringed-instrument of the guitar family, used in the traditional musics of Spain and various Latin American nations\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tipper", "{\"term\":\"tipper\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone who tips, someone who gives a tip\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The Americans are among the most generous tippers in the world\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A kind of ale brewed with brackish water obtained from a particular well; -- so called from the first brewer of it, one Thomas Tipper\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A small moustache\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A goods vehicle with a tippable body, used for carrying loose materials such as gravel or rubble; a tipper truck or lorry.Category:English agent nounsCategory:en:Vehicles\", \"priority\":5}]}, \"synonyms\":{}}");

	add("tippet", "{\"term\":\"tippet\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a shoulder covering, typically the fur of a fox, with long ends that dangle in fron\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a stole worn by Anglican minister\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A length of twisted hair or gut in a fishing line\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A handful of straw bound together at one end, used for thatching\", \"priority\":4}]}, \"synonyms\":{}}");

	add("tippex", "{\"term\":\"tippex\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{trademark erosion|Tipp-Ex|[http://www.bicworld.com/ BIC corporation]|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A particular brand of correction fluid\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tipranavir", "{\"term\":\"tipranavir\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An anti-retroviral drug of the protease inhibitor class that is used in to treat HIV infected patients\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tipsheet", "{\"term\":\"tipsheet\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|tip|sheet|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A page or mailing of information and hint\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tipsiness", "{\"term\":\"tipsiness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|tipsy|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The property of being tipsy\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tiptoe", "{\"term\":\"tiptoe\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|tip|toe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The tips of one\u0027s toes collectively\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tiptoer", "{\"term\":\"tiptoer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|tiptoe|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who tiptoes\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1986\u0027\u0027, Ken Dychtwald, \u0027Bodymind\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"We all know people who are \u0027\u0027tiptoers\u0027\u0027. When they walk, they seem to be walking mostly on their toes and hardly put any weight at all on their heels\", \"priority\":3}]}, \"synonyms\":{}}");

	add("tiptop", "{\"term\":\"tiptop\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|tip|top|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The very topmost point\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The highest or utmost degree; the best of anything\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }