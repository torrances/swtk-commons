package org.swtk.commons.dict.wiktionary.generated.f.i.t;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFIT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("fitness", "{\"term\":\"fitness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|fit|ness|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of being fit, suitable or appropriate\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The cultivation of an attractive and/or healthy physique\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The condition of being attractive, fanciable or beautiful\", \"priority\":3}]}, \"synonyms\":{}}");

	add("fitspiration", "{\"term\":\"fitspiration\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|fit|inspiration|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Photographs or other material intended to provide motivation to exercise and be physically fit\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2013\u0027\u0027, Rhiannon Lucy Cosslett, \u0026quot;[http://www.theguardian.com/commentisfree/2013/aug/06/obesity-crisis-fitspiration-body-image-women Our obesity crisis won\u0027t be solved by \u0027fitspiration\u0027]\u0026quot;, \u0027The Guardian\u0027, 6 August 2013\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"In contrast, \u0027\u0027fitspiration\u0027\u0027 operates under such mantras as \u0026quot;strong is the new skinny\u0026quot; and \u0026quot;fit not thin\u0026quot;. Its focus on images of athletic women have led some to hail it as a positive step, and it has now been transposed offline, with the model Daisy Lowe fronting a newspaper campaign\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2013\u0027\u0027, Harriet Williamson, \u0026quot;[http://www.telegraph.co.uk/women/womens-life/10376945/Beware-of-the-dangerous-fetishising-of-fitness-on-social-media.html Beware of the dangerous fetishising of fitness on social media]\u0026quot;, \u0027The Telegraph\u0027, 14 October 2013\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The craze on Instagram and Tumblr within the last year has been for blogs and accounts devoted to ‘fitspo’ or ‘\u0027\u0027fitspiration\u0027\u0027’\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2015\u0027\u0027, Lianne McTavish, \u0027Feminist Figure Girl: Look Hot While You Fight the Patriarchy\u0027, State University of New York Press (2015), ISBN 9781438454771, [https://books.google.com/books?id\u003dD6wtBgAAQBAJ\u0026amp;pg\u003dPA72\u0026amp;dq\u003d%22fitspiration%22 page 72\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"This situation is particularly clear within certain facets of fitness culture, which employ “\u0027\u0027fitspiration\u0027\u0027” slogans to berate those considered unfit or unhealthy, asking “What is your excuse?” or declaring “Every excuse is a decision to fail.”\", \"priority\":7}]}, \"synonyms\":{}}");

	add("fitspo", "{\"term\":\"fitspo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027fitspiration\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Photographs or other material intended to provide motivation to exercise and be physically fit\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2013\u0027\u0027, book review from \u0027Elle\u0027, quoted in Alexandra Heminsley, \u0027Running Like a Girl: Notes on Learning to Run\u0027, Scribner (2013), ISBN 9781451697155, [https://books.google.com/books?id\u003dCoW4AwAAQBAJ\u0026amp;pg\u003dPP1\u0026amp;dq\u003d%22fitspo%22 unnumbered page\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"It\u0027s packed with get-off-your-butt \u0027\u0027fitspo\u0027\u0027 from the author\u0027s journey from 1-miler to marathoner\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2013\u0027\u0027, Jennifer J. Thomas \u0026amp; Jenni Schaefer, \u0027Almost Anorexic: Is My (or My Loved One\u0027s) Relationship with Food a Problem?\u0027, Hazelden (2013), ISBN 9781616494988, [https://books.google.com/books?id\u003d2fUW7rAHR-MC\u0026amp;pg\u003dPA137\u0026amp;dq\u003d%22fitspo+sites+do+one+thing%22 page 137\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Both thinspo and \u0027\u0027fitspo\u0027\u0027 sites do one thing very well: make people feel bad about themselves\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2013\u0027\u0027, Harriet Williamson, \u0026quot;[http://www.telegraph.co.uk/women/womens-life/10376945/Beware-of-the-dangerous-fetishising-of-fitness-on-social-media.html Beware of the dangerous fetishising of fitness on social media]\u0026quot;, \u0027The Telegraph\u0027, 14 October 2013\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The idea that ‘\u0027\u0027fitspo\u0027\u0027’ images have anything to do with health or fitness is entirely spurious and the use of my picture is proof of this\", \"priority\":7}]}, \"synonyms\":{}}");

	add("fitweed", "{\"term\":\"fitweed\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{compound|fit|weed|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Eryngium foetidum\u0027, a plant supposed to be a remedy for fits\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }