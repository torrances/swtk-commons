package org.swtk.commons.dict.wiktionary.generated.o.t.h;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOTH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("otherhood", "{\"term\":\"otherhood\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|other|hood|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being other\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1994\u0027\u0027, Norbert Wiley, \u0027The Semiotic Self\u0027, University of Chicago Press (1994), ISBN 9780226898162, [https://books.google.com/books?id\u003duQdSudyH5HoC\u0026amp;pg\u003dPA131\u0026amp;dq\u003d%22otherhood%22 page 131\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"This \u0027\u0027otherhood\u0027\u0027, itself based on solidarity with other human beings, provides the difference which evades paradox\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1997\u0027\u0027, Adam B. Seligman, \u0027The Problem of Trust\u0027, Princeton University Press (2000), ISBN 9780691050201, [https://books.google.com/books?id\u003dafXbJcXOKJkC\u0026amp;pg\u003dPA48\u0026amp;dq\u003d%22otherhood%22 page 48\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The attempt to remake nature in terms of grace and to restructure the world according to other-worldly postulates resulted in the eventual loss of transcendent \u0027\u0027otherhood\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027, Robert Vanderlan, \u0027Intellectuals Incorporated: Politics, Art, and Ideas Inside Henry Luce\u0027s Media Empire\u0027, University of Pennsylvania Press (2010), ISBN 9780812205633, [https://books.google.com/books?id\u003dg82OAyn-HKkC\u0026amp;pg\u003dPA275\u0026amp;dq\u003d%22otherhood%22 page 275\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The result is a life of “\u0027\u0027otherhood\u0027\u0027” where the individual is divided from any sense of community or social identity\", \"priority\":7}]}, \"synonyms\":{}}");

	add("othering", "{\"term\":\"othering\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|other|ing|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The process of perceiving or portraying someone or something as fundamentally different or alien\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2002\u0027\u0027, \u0027The Great Nation\u0027, Penguin 2003, p. 553\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The process of political \u0027\u0027othering\u0027\u0027 was not simply a rhetorical consequence of the Revolution\u0027s own unifying political culture\", \"priority\":3}]}, \"synonyms\":{}}");

	add("otherkin", "{\"term\":\"otherkin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|other|kin|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who claims or believes that their soul is non-human\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"issn \u003d 0042-6180 url \u003d http://www.villagevoice.com/2001-02-13/news/elven-like-me/ passage \u003d Some elves claim to be allergic to iron and other products of encroaching modernity, while one breed of \u0027\u0027Otherkin\u0027\u0027—dragons in human bodies—insist that having no allergies is a sign of Otherness\", \"priority\":2}]}, \"synonyms\":{}}");

	add("others", "{\"term\":\"others\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Other people\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Those remaining after one or more people or items have left, or done something else, or been excluded\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"chapter\u003d4|passage\u003dThe Celebrity, by arts unknown, induced Mrs. Judge Short and two other ladies to call at Mohair on an afternoon when Mr. Cooke was trying a trotter on the track.Their example was followed by \u0027\u0027others\u0027\u0027 at a time when the master of Mohair was superintending in person the docking of some two-year-olds, and equally invisible\", \"priority\":3}]}, \"synonyms\":{}}");

	add("otherworld", "{\"term\":\"otherworld\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) {{m|enm|otherworld}}, equivalent to {{prefix|other|world|lang\u003den|nocat\u003d1}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A world beyond death; an afterlife\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A world other than the everyday world\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }